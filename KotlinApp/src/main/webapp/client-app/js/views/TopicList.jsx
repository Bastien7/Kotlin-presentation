import React from "react";
import Reflux from "reflux";
import {List, ListItem, Subheader, Dialog, TextField, RaisedButton, FlatButton, FontIcon } from "material-ui";
import MessageActions from "../actions/MessageActions";
import TopicActions from "../actions/TopicActions";
import TopicStore from "../stores/TopicStore";
import Moment from "moment";


const Topic = (props) => {
	const topic = props.topic;
	return (
		<ListItem
			primaryText={topic.question}
			secondaryText={Moment(topic.date.nano).format("HH:mm DD-MM-YYYY") + " (" + topic.answers.length + " answers)"}
			leftIcon={<FontIcon className="fa fa-question"/>}
		/>
	);
};


const QuestionForm = (props) => (
	<div>
		<div>
			<span>So, what's your question?</span>
		</div>
	    <div>
	    	<TextField multiLine fullWidth floatingLabelText="Your question" value={props.question} onChange={props.onChangeQuestion}/>
    	</div>
	</div>
);


class TopicList extends Reflux.Component {
	constructor() {
		super()
		
		var defaultTopics = [
			{title: "Question 1", question: "When will this application be finished?"},
			{title: "Question 2", question: "Why are you using Material-UI?"},
		];
		
		this.state = {
			isAskingQuestion: false,
			question: "",
			topics: defaultTopics
		};
		this.store = TopicStore;

		TopicActions.getTopics();		
	}
	
	onClickCreateQuestion = () => this.setState({isAskingQuestion: true});
	onCloseQuestionForm = () => this.setState({isAskingQuestion: false});
	
	onChangeQuestion = (event) => this.setState({question: event.target.value});
	onClickConfirm = () => {
		if(this.state.question.length > 0) {
			TopicActions.createTopic(this.state.question);
			this.setState({isAskingQuestion: false, question: ""});
		}
	};
	
	
   	dialogActions = () => [
  		<RaisedButton label="Confirm" primary disabled={this.state.question.length == 0} onClick={this.onClickConfirm} onTouchTap={this.onClickConfirm} />,
  		<FlatButton label="Cancel" onClick={this.onCloseQuestionForm} onTouchTap={this.onCloseQuestionForm} />
    ];
	
	render = () => (
		<div>
			<div className="question-button">
				<RaisedButton secondary label="Ask a question" onClick={this.onClickCreateQuestion}/>
				<Dialog title="Ask a question" actions={this.dialogActions()} modal={true} open={this.state.isAskingQuestion}>
	          		<QuestionForm question={this.state.question} onChangeQuestion={this.onChangeQuestion}/>
		        </Dialog>
			</div>
			{this.state.topics.length > 0 ?
				<List>
					<Subheader>Questions</Subheader>
					{this.state.topics.map((topic, index) => <Topic key={index} topic={topic}/>)}
				</List> : null
			}
		</div>
	);
}

module.exports = TopicList;
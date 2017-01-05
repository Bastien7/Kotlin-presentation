import React from "react";
import Reflux from "reflux";
import {List, ListItem, Subheader, RaisedButton, FontIcon } from "material-ui";
import MessageActions from "../actions/MessageActions";
import TopicStore from "../stores/TopicStore";

const Topic = (props) => (
	<ListItem
		primaryText={props.topic.title}
		leftIcon={<FontIcon className="fa fa-question"/>}
	/>
);

class TopicList extends Reflux.Component {
	constructor() {
		super()
		
		var defaultTopics = [
			{title: "Question 1", question: "When will this application be finished?"},
			{title: "Question 2", question: "Why are you using Material-UI?"},
		];
		
		this.state = {topics: defaultTopics};
		this.store = TopicStore;
	}
	
	onClickCreateQuestion = () => MessageActions.getMessages();
		
	render = () => (
		<div>
			<div className="question-button">
				<RaisedButton secondary label="Ask a question" onClick={this.onClickCreateQuestion}/>
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
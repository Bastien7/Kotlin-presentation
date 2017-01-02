import React from 'react';
import {List, ListItem, Subheader, RaisedButton, FontIcon } from 'material-ui';

const Topic = (props) => (
	<ListItem
		primaryText={props.topic.title}
		leftIcon={<FontIcon className="fa fa-question"/>}
	/>
);

class TopicList extends React.Component {
	constructor() {
		super()
		
		var defaultTopics = [
			{title: "Question 1", question: "When will this application be finished?"},
			{title: "Question 2", question: "Why are you using Material-UI?"},
		];
		
		this.state = {topics: defaultTopics};
	}
		
	render = () => (
		<div>
			<RaisedButton className="question-button" label="Ask a question" secondary/>
			<List>
				<Subheader>Questions</Subheader>
				{this.state.topics.map((topic, index) => <Topic key={index} topic={topic}/>)}
			</List>  
		</div>
	);
}

module.exports = TopicList;
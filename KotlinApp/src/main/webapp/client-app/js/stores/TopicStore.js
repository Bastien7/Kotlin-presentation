import Reflux from "reflux";
import MessageActions from "../actions/MessageActions";
import TopicActions from "../actions/TopicActions";
import {MessageApi, TopicApi} from "../api/Api";

class TopicStore extends Reflux.Store {
	constructor() {
		super();
		this.state = {
			messages: [],
			topics: [],
			selectedTopic: null
		};
		
		this.listenTo(MessageActions.getMessages, this.onGetMessages);
		this.listenTo(TopicActions.getTopics, this.onGetTopics);
		this.listenTo(TopicActions.createTopic, this.onCreateTopic);
	}
	
	onGetMessages = (messages) => MessageApi.getMessages().done((messages) => this.setState({messages: messages}));
	
	onGetTopics = (topics) => TopicApi.getTopics().done((topics) => this.setState({topics: topics}));
	
	onCreateTopic = (question) => TopicApi.createTopic(question).done(TopicActions.getTopics);
}

module.exports = TopicStore;
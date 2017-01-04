import Reflux from "reflux";
import MessageActions from "../actions/MessageActions";
import {MessageApi} from "../api/Api";

class TopicStore extends Reflux.Store {
	constructor() {
		super();
		this.state = {
			messages: [],
			topics: [],
			selectedTopic: null
		};
		
		this.listenTo(MessageActions.getMessages, this.onGetMessages);
	}
	
	onGetMessages = (messages) => {
		MessageApi.getMessages().done((messages) => this.setState({messages: messages}));
	}
}

module.exports = TopicStore;
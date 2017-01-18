import Reflux from "reflux";
import TopicApi from "../api/Api";

class TopicActions {
	static getTopics = Reflux.createAction();
	static createTopic = Reflux.createAction();
	static addAnswer = Reflux.createAction();
}

module.exports = TopicActions;
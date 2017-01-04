import Reflux from "reflux";
import MessageApi from "../api/Api";

class MessageActions {
	static getMessages = Reflux.createAction();
	static saveMessages = Reflux.createAction();
	static updateMessages = Reflux.createAction();
	static deleteMessages = Reflux.createAction();
}

module.exports = MessageActions;
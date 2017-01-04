import Configuration from "../configuration/Configuration";
import CallAjax from "../utils/CallAjax";

class MessageApi {
	static API = Configuration.backendApi + "message";
	
	static getMessages = () => CallAjax.get(MessageApi.API);
	static saveMessage = (message) => CallAjax.post(MessageApi.API, message);
	static updateMessage = (message) => CallAjax.put(MessageApi.API, message);
	static deleteMessage = (message) => CallAjax.delete(MessageApi.API, message.id);
}

module.exports = {
	MessageApi
};
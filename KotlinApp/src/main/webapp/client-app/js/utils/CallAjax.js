const $ = require("jquery");

class CallAjax {
    constructor(ajaxQuery) {
        this.ajaxQuery = ajaxQuery;
    }

    static _configure = (type, url, data) => {
        let configuration = {
            type: type,
            url: url.toString()
        };

        if(data) {
            configuration.data = JSON.stringify(data);
            configuration.contentType = 'text/json';
        }

        return new CallAjax($.ajax(configuration));
    };

    static get = (url) => CallAjax._configure("GET", url);
    static post = (url, data) => CallAjax._configure("POST", url, data);
    static put = (url, data) => CallAjax._configure("PUT", url, data);
    static delete = (url, data) => CallAjax._configure("DELETE", url, data);

    done = (onDone) => {
        this.ajaxQuery.done((data, textStatus/*, jqXHR*/) => {
            onDone(data, textStatus);
        });

        return this;
    };

    fail = (onFail) => {
        this.ajaxQuery
            .fail((jqXHR, textStatus, errorThrown) => {
                onFail(errorThrown, textStatus);
            });

        return this;
    };
}

module.exports = CallAjax;

0

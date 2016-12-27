import React from 'react';
import ReactDom from 'react-dom';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import FlatButton from 'material-ui/FlatButton';

class TestView extends React.Component {
    constructor(props) {
        super(props);
        this.state = { }
    }

    render = () => (
        <div>
            <h1 className="title">App page</h1>
			<div>
				<MuiThemeProvider>
					<FlatButton label="Click here!"/>
				</MuiThemeProvider>
			</div>
        </div>
    );
}

module.exports = TestView;
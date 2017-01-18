import React from 'react'
import { render } from 'react-dom'
import { Router, Route, Link, browserHistory } from 'react-router'
import {AppBar, MuiThemeProvider} from 'material-ui';
import getMuiTheme from 'material-ui/styles/getMuiTheme';

const TopicList = require("./TopicList");
const Topic = require("./Topic");
  
class MyRouter extends React.Component {
	render = () => (
		<div id="wrapper">
			<MuiThemeProvider muiTheme={getMuiTheme()}>
				<div id="appContent">
					<AppBar title="Questions" />
			  		<Router history={browserHistory}>
						<Route path="/" component={TopicList}>
							<Route path="/:topicId" component={Topic}/>
				    	</Route>
				  	</Router>
				</div>
			</MuiThemeProvider>
		</div>
	);
}

module.exports = MyRouter;
import React from 'react';
import {AppBar, MuiThemeProvider} from 'material-ui';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import TopicList from "./TopicList";

class Home extends React.Component {	
	render = () => (
		<div id="wrapper">
			<MuiThemeProvider muiTheme={getMuiTheme()}>
				<div id="appContent">
					<AppBar title="Questions" iconClassNameRight="muidocs-icon-navigation-expand-more"/>
					<TopicList/>
				</div>
			</MuiThemeProvider>
		</div>
	);
}

module.exports = Home;
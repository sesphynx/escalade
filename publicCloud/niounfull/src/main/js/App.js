import React, {Component} from 'react' ;
import ReactDOM from 'react-dom';

export class App extends Component{
	render(){
		return (
			<div>
				<h1>Welcome to our Springboot-React Full Stack Template </h1>
			</div>
		)
	}

}
export default App;
ReactDOM.render(<App />, document.querySelector('#app'))
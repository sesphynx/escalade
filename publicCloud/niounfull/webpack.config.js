var path = require ('path');

module.exports={
		entry: './src/main/js/App.js',
		devtool: 'sourcemaps',
		cache: true,
		mode: 'development',
		output: {
			path:_dirname,
			filename:'./src/main/resources/static/built/bundle.js'
		},
		module:{
			rules:[
				{
					test: path.join(_dirname,'.'),
					exclude: /(node_modules)/,
					use: [{
						loader: 'babel-loader',
						options:{
							presets:["@babel/preset-env","@babel/preset-raect"]
						}
					}]
				},
				{
					
					test:/\.css$/,
					use:[
						'class-loader',
						'css-loader'
					]
				},
				{
					
					test:/\.(png|svg|jpg|gif|eot|otf|ttf|woff|woff2)$/,
					use:[
						{
						loader: url-loader',
						options:{}
						}
						]
				}
					]
					
				}
	
};
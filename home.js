import React, { Component } from 'react';

class Home extends Component {
render() {
	const myStyle={
		backgroundImage:"https://www.wallpapersun.com/wp-content/uploads/2020/06/colorful-ice-cream-wallpaper-71415-73878-hd-wallpapers.jpg",
		height: "500px",
  backgroundPosition: "center",
  backgroundRepeat: "no-repeat",
  backgroundSize: "cover",
  color: 'white',
  textAlign: "center",
  fontSize: 14,
    color:"FFB428",
    paddingTop: "250px",
    fontFamily:'Roboto'
	};
	return (
	<body style={myStyle}>
	</body>
	);
}
}

export default Home;
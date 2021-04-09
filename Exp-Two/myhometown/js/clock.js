function change() {
	var d = new Date();
	var h = d.getHours(),
		m = d.getMinutes(),
		s = d.getSeconds();
	var out = h + ":" ;
	var cnt=0;
	var sign=1;
	if(m<10){
		out=out+0;
	}
	out=out+m+":";
	if(s<10){
		out=out+0;
	}
	out=out+s;
	
	
	if(m == 0&&s<=15) {
		document.getElementById("clock").style.fontSize = "70px";
		document.getElementById("clock").style.color = "red";
		
	}
	if(m==0&&s>15){
		document.getElementById("clock").style.fontSize = "30px";
		document.getElementById("clock").style.color = "white";
	}
	
	document.getElementById("clock").innerHTML = out;
}

setInterval(change, 500);
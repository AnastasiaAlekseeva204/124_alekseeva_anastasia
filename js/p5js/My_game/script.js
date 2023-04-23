var px = 21
var delta = 1;
function setup(){
	createCanvas(1000,500);
	background('#abe2e9');
}
function draw(){
	background('#abe2e9');
	//rect(0,0,200,200);
	fill('#58ab10');
	rect(0,400,1000,100);
	fill('#e5ed11');
	ellipse(50,40,60,60);
	
	
	fill('#e519bd');
	ellipse(px,370,40,60);
	px = px+delta;
	if (px >= 980 || px <=20){
		delta = -delta;
	}
	
}
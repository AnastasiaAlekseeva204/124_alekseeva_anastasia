var px = 21
var delta = 1;
var py = 370;
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
	fill('#74e4a8');
	triangle(400,400,460,350,520,400);
	triangle(400,350,460,300,520,350);
	triangle(400,300,460,250,520,300);
	fill('#997629');
	rect(200,300,14,100);
	fill('#70b909');
	ellipse(207,225,150,150);
	fill('red');
	ellipse(180,170,20,20);
	ellipse(230,170,20,20);
	ellipse(160,200,20,20);
	ellipse(205,200,20,20);
	ellipse(250,200,20,20);
	ellipse(230,230,20,20);
	ellipse(185,230,20,20);
	ellipse(160,260,20,20);
	ellipse(205,260,20,20);
	ellipse(245,260,20,20);
	fill('#997629');
	rect(750,300,14,100);
	fill('#70b909');
	ellipse(757,250,100,100);
	fill('#e519bd');
	ellipse(px,py,40,60);
	px = px+delta;
	if (px >= 980 || px <=20){
		delta = -delta;
	}
	
}
function mousePressed() {
	py = py-50;
}
function mouseReleased(){
    py = py+50;	
}
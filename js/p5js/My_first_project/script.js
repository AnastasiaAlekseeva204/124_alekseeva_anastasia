function setup(){
	createCanvas(500,700);
	background('#a5cdce');
}
function draw() {
	fill('blue');
	rect(50,0,50,50);
	fill('#bd60ac');
	rect(0,50,150,200);
	fill('white');
	ellipse(25,130,50,50);
	ellipse(125,130,50,50);
	fill('#96f67c');
	triangle(50,150,100,150,75,175);
	fill('#aac1c8');
	triangle(10,220,40,220,25,190);
	triangle(40,220,70,220,55,190);
	triangle(70,220,100,220,85,190);
	triangle(100,220,130,220,115,190);
	fill('#d0574e');
	triangle(0,400,150,400,75,250);
	fill('#767bff');
	rect(40,400,20,80);
	rect(90,400,20,80);
	line(37,325,10,350);
	line(113,325,140,350);
	fill('yellow');
	star(75,325,15,35,5);

}
function star(x, y, radius1, radius2, npoints) {
  let angle = TWO_PI / npoints;
  let halfAngle = angle / 2.0;
  beginShape();
  for (let a = 0; a < TWO_PI; a += angle) {
    let sx = x + cos(a) * radius2;
    let sy = y + sin(a) * radius2;
    vertex(sx, sy);
    sx = x + cos(a + halfAngle) * radius1;
    sy = y + sin(a + halfAngle) * radius1;
    vertex(sx, sy);
  }
  endShape(CLOSE);
}
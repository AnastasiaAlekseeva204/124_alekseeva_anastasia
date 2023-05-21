var px = 21
var delta = 1;
var py = 370;
var sp;
let timer;
let fn;
let score;
var flag_game = 0;
let rects = [];
let countrect = 3;
var scolor = ['#a24db2','#421f9c','#a61d15','black','white','#b11b51'];
function setup(){
	createCanvas(1000,500);
	background('#abe2e9');
	timer = new timing();
	fn  = new fon();
	score = new scoring();
//	r = new specrec();
    for(let i = 0; i<countrect;i++){
		let myr = rectob.init();
		let col = round(random(0,5));
		rects.push(new rectob(myr.x,myr.y,40,40,col));
	}
	//console.log(rects.length);
}
function draw(){
	background('#abe2e9');
	fn.showBg();
	fn.showSun();
	if(flag_game == 1){
		noStroke();
		fill('black');
		textSize(35);
		text('Игра окончена!',370,170);
		textSize(30);
		text('Ваш счет: '+score.s, 370, 210);
		return;
	}
	timer.show();
	score.show();
	
	noStroke();
	fill('#e519bd');
	ellipse(px,py,40,60);
	for(let i = 0; i<countrect; i++){
		if((px == round(rects[i].x)) && ((py-10) == round(rects[i].y))){
			flag_game = 1;
		}
		
	}
	px = px+delta;
	if (px >= 980 || px <=20){
		delta = -delta;
		if(score.s > 0 && (score.s % 3 == 0)){
			countrect = countrect+1;
		}
		for(let i = 0; i<countrect; i++){
			let myr  = rectob.init();
			let col = round(random(0,5));
			rects[i].setall(myr.x,myr.y,40,40,col);
		}
	}
	for(let i = 0; i<countrect; i++){
		rects[i].display();
	}
	//r.show();
}
class rectob{
	constructor(x,y,w,h,col){
		this.x = x;
		this.y = 360;
		this.w = w;
		this.h = h;
		this.col = col;
	}
	setall(x,y,w,h,col){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.col = col;
	}
	display(){
		fill(scolor[this.col]);
		rect(this.x,this.y,this.w,this.h);
	}
	static init(){
		return {
			x: random(50,950),
			y:360,
			w:40,
			h:40,
		}
	}
}
class scoring{
	constructor(){
		this.s = 0;
    }
	set(s){
		this.s = s;
	}
	show(){
		noStroke();
		fill('black');
		textSize(20);
		str = 'Счет: '+this.s;
		text(str,10,50);
	}
}
class timing {
	constructor(){
		this.t = 0;
	}
	show(){
		this.t = Math.floor(millis()/1000);
		noStroke();
		fill('black');
		textSize(20);
		str = 'Время: '+this.t;
		text(str,10,25);
	}
}
class fon{
	constructor(){
	}
	showSun(){
		stroke('yellow');
		strokeWeight(3);
		fill('#e5ed11');
		ellipse(840,60,60,60);
		line(875,60,920,60);
		line(750,60,805,60);
		line(840,90,840,135);
		line(840,10,840,30);
	}
	showBg(){
		stroke('black');
		strokeWeight(1);
		fill('#58ab10');
		rect(0,400,1000,100);
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
		fill('');
		ellipse(215,60,60,30);
		ellipse(290,30,60,30);
		ellipse(350,75,60,30);
		fill('#997629');
		rect(750,300,14,100);
		fill('#70b909');
		ellipse(757,250,100,100);
	}
}

function mousePressed() {
	py = py-50;
}
function mouseReleased(){
    py = py+50;	
	for(let i = 0; i<countrect; i++){
		var to1  = round(rects[i].x);
		var from1 = to1+40;
		if(px>=to1 && px<=from1){
			score.set(score.s+1);
			rects[i].setall(-40,0,40,40,1);
		}
	}
}
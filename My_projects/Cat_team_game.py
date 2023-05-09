import random

class Team:
    def __init__(self, color):
        self.color = color
        self.score = 0

    def score_point(self):
        self.score += 1

class Ball:
    def __init__(self):
        self.position = (0, 0)
        self.in_play = False

    def throw(self):
        self.in_play = True
        self.position = (random.randint(1, 10), random.randint(1, 10))
        print("Ball thrown!")
    
    def is_in_play(self):
        return self.in_play

    def get_position(self):
        return self.position

class Ring:
    def __init__(self):
        self.position = (random.randint(1, 10), random.randint(1, 10))

    def is_ball_in_ring(self, ball_position):
        return ball_position == self.position

# Create the teams and the ball
gray_team = Team("gray")
red_team = Team("red")
ball = Ball()
ring = Ring()

# Play the game
while True:
    # Display the score
    print(f"Score: Gray {gray_team.score} - Red {red_team.score}")

    # Throw the ball
    ball.throw()

    # Check if the ball is in the ring
    if ring.is_ball_in_ring(ball.get_position()):
        # Award a point to the team that threw the ball
        if ball.get_position()[0] % 2 == 0:
            gray_team.score_point()
            print("Gray team scores!")
        else:
            red_team.score_point()
            print("Red team scores!")
    else:
        print("Ball missed the ring.")

    # Check if either team has won
    if gray_team.score == 20:
        print("Gray team wins!")
        break
    elif red_team.score == 20:
        print("Red team wins!")
        break
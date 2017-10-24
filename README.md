# Cheesy-Chasers

Cheesy Chase

Participants:
	- The Attacker
	- The Players
	- The ZOMBIFIED ?
DON’T FORGET THE ARENA…

The Master Plan
	Five random robot players will be created. Choose from the
	set of robot players who will be the zombified and the attacker.
	The Attacker will chase one from the set of robot players.
	(Choosing from the set of robot players is up to you. Meaning,
	you can do select the nearest robot player or just randomly). If
	the attacker successfully chased down a player, the two of them
	switches, the attacker will be either a normal robot player or will
	be zombified. When will the game stop? when you close the
	arena.
	?.
  
Classes:
	- TheArena(Singleton)
		o Uses JFrame for the arena
		o Define needed methods
	- RobotPlayer(Context)
		o Fields: name, x and y location, a reference of the
		Strategy and define other fields if needed.
		o Methods: move(), drawMe() and define other
		methods if needed.
	- ITheMove(Strategy)
		o Fields: a reference of the
		o Methods: moveIt(),
	- StraightMover(ConreteStrategy)
		o Methods: moveIt() // moves 5 straight movements
		either x or y (straight x or straight y) and changes
		direction..if within arena boundary, resets
		movement counting then changes direction..
	- CrazyMover(ConreteStrategy)
		o Methods: moveIt() // randomly move x and y
		position…that’s why his zombified..:)
	- AttackMover(ConreteStrategy)
		o Methods: moveIt() // attacks a robot player

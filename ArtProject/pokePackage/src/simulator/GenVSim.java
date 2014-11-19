package src.simulator;

import src.model.Ability;
import src.model.Move;
import src.model.Pkmn;
import src.model.Status;

public class GenVSim {
	
	public static int counter = 0;
	
	private Pkmn p1;
	private Pkmn p2;
	private int count = 0; // number of rounds
	
	public GenVSim(Pkmn p1, Pkmn p2, int i) {
		this.p1 = p1;
		this.p2 = p2;
		count = i;
		counter++;
	}

	// A single battle between the Pkmn stored in this
	// returns: 0 for loss, 1 for win (tie from Explosion, recoil, etc counts as loss to user)
	// TODO: deal with ties (currently counts as win)
	// parameter: toggles in-battle text
	public int oneBattle(boolean showText) {
		
//		if (p1.getName().equals("Omanyte")) {
//			int i = 0;
//			while(i < (i+1)) {
//				System.out.println("Praise Lord Helix!");
//				i++;
//			}
//		}
		
		int acc = 0;
		if (showText) {
			System.out.println();
			System.out.println("-- Battle start --");
		}
		
		// download
		if (p1.getAbility() == Ability.DOWNLOAD) {
			if (p2.getModifiedDefence() > p2.getModifiedSpDefence()) {
				p1.incAttackMod();
				if (showText) {
					// TODO: text for Download
				}
			} else {
				p1.incSpAttackMod();
				if (showText) {
					// TODO: text for Download
				}
			}
		}
		
		if (p2.getAbility() == Ability.DOWNLOAD) {
			if (p1.getModifiedDefence() > p1.getModifiedSpDefence()) {
				p2.incAttackMod();
				if (showText) {
					// TODO: text for Download
				}
			} else {
				p2.incSpAttackMod();
				if (showText) {
					// TODO: text for Download
				}
			}
		}
		
		
		// intimidate
		if (p1.getAbility() == Ability.INTIMIDATE && !(p2.getAbility() == Ability.HYPER_CUTTER || p2.getAbility() == Ability.CLEAR_BODY
				|| p2.getAbility() == Ability.WHITE_SMOKE)) {
			p2.decAttackMod();
			if (showText) {
				System.out.println(p2.getName() + "'s Attack fell!");
			}
		}
		
		if (p2.getAbility() == Ability.INTIMIDATE && !(p1.getAbility() == Ability.HYPER_CUTTER || p1.getAbility() == Ability.CLEAR_BODY
				|| p1.getAbility() == Ability.WHITE_SMOKE)) {
			p1.decAttackMod();
			if (showText) {
				System.out.println(p1.getName() + "'s Attack fell!");
			}
		}
		
		
		boolean p1First = (p1.getModifiedSpeed() >= p2.getModifiedSpeed());
		int p1Move = 1;
		int p2Move = 1;
		int turnCount = 0;
		while (!isBattleOver()) {
			p1Move = chooseMove(p1, p2, turnCount);
			p2Move = chooseMove(p2, p1, turnCount);
			
			if (p1.getMove(p1Move).getPriority() == p2.getMove(p2Move).getPriority()) {
				p1First = (p1.getModifiedSpeed() >= p2.getModifiedSpeed());
				if (p1.getModifiedSpeed() == p2.getModifiedSpeed()) {
					p1First = (Math.random() < 0.5);
				}
			} else {
				p1First = (p1.getMove(p1Move).getPriority() > p2.getMove(p2Move).getPriority());
			}
			
			if (p1First) {
				
				// TODO: moves that can be used during sleep, etc
				if (p1.getStatus().equals(Status.SLEEP)) {
					if (p1.getSleepCounter() > 0) {
						if (showText) {
							System.out.println(p1.getName() + " is fast asleep!");
						}
						p1.setSleepCounter(p1.getSleepCounter() - 1);
						if (p1.getAbility() == Ability.EARLY_BIRD) { p1.setSleepCounter(p1.getSleepCounter() - 1); }
					} else {
						if (showText) {
							System.out.println(p1.getName() + " woke up!");
						}
						p1.setStatus(Status.OKAY);
						p1.useMoveIndex(p1Move, p2, showText);
					}
				}
				else if (p1.getStatus().equals(Status.PARALYSIS) && Math.random() < 0.25) {
					if (showText) {
						System.out.println(p1.getName() + " is paralysed! It can't move!");
					}
				}
				// TODO: moves that thaw on use
				else if (p1.getStatus().equals(Status.FREEZE)) {
					if (Math.random() >= 0.2) {
						if (showText) {
							System.out.println(p1.getName() + " is frozen solid!");
						}
					} else {
						if (showText) {
							System.out.println(p1.getName() + " is no longer frozen!"); // TODO: correct text?
						}
						p1.setStatus(Status.OKAY);
						p1.useMoveIndex(p1Move, p2, showText);
					}
				} else {
					p1.useMoveIndex(p1Move, p2, showText);
				}
				
				if (isBattleOver()) { break; }

				// TODO: moves that can be used during sleep, etc
				if (p2.getStatus().equals(Status.SLEEP)) {
					if (p2.getSleepCounter() > 0) {
						if (showText) {
							System.out.println(p2.getName() + " is fast asleep!");
						}
						p2.setSleepCounter(p2.getSleepCounter() - 1);
						if (p2.getAbility() == Ability.EARLY_BIRD) { p2.setSleepCounter(p2.getSleepCounter() - 1); }
					} else {
						if (showText) {
							System.out.println(p2.getName() + " woke up!");
						}
						p2.setStatus(Status.OKAY);
						p2.useMoveIndex(p2Move, p1, showText);
					}
				}
				else if (p2.getStatus().equals(Status.PARALYSIS) && Math.random() < 0.25) {
					if (showText) {
						System.out.println(p2.getName() + " is paralysed! It can't move!");
					}
				}
				// TODO: moves that thaw on use
				else if (p2.getStatus().equals(Status.FREEZE)) {
					if (Math.random() >= 0.2) {
						if (showText) {
							System.out.println(p2.getName() + " is frozen solid!");
						}
					} else {
						if (showText) {
							System.out.println(p2.getName() + " is no longer frozen!"); // TODO: correct text?
						}
						p2.setStatus(Status.OKAY);
						p2.useMoveIndex(p2Move, p1, showText);
					}
				} else {
					// flinch
					if (p2.isFlinch()) {
						if (showText) {
							System.out.println(p2.getName() + " flinched!");
						}
					} else {
						p2.useMoveIndex(p2Move, p1, showText);
					}
				}
			} else {

				// TODO: moves that can be used during sleep, etc
				if (p2.getStatus().equals(Status.SLEEP)) {
					if (p2.getSleepCounter() > 0) {
						if (showText) {
							System.out.println(p2.getName() + " is fast asleep!");
						}
						p2.setSleepCounter(p2.getSleepCounter() - 1);
						if (p2.getAbility() == Ability.EARLY_BIRD) { p2.setSleepCounter(p2.getSleepCounter() - 1); }
					} else {
						if (showText) {
							System.out.println(p2.getName() + " woke up!");
						}
						p2.setStatus(Status.OKAY);
						p2.useMoveIndex(p2Move, p1, showText);
					}
				}
				else if (p2.getStatus().equals(Status.PARALYSIS) && Math.random() < 0.25) {
					if (showText) {
						System.out.println(p2.getName() + " is paralysed! It can't move!");
					}
				}
				// TODO: moves that thaw on use
				else if (p2.getStatus().equals(Status.FREEZE)) {
					if (Math.random() >= 0.2) {
						if (showText) {
							System.out.println(p2.getName() + " is frozen solid!");
						}
					} else {
						if (showText) {
							System.out.println(p2.getName() + " is no longer frozen!"); // TODO: correct text?
						}
						p2.setStatus(Status.OKAY);
						p2.useMoveIndex(p2Move, p1, showText);
					}
				} else {
					p2.useMoveIndex(p2Move, p1, showText);
				}
				
				if (isBattleOver()) { break; }
				
				// TODO: moves that can be used during sleep, etc
				if (p1.getStatus().equals(Status.SLEEP)) {
					if (p1.getSleepCounter() > 0) {
						if (showText) {
							System.out.println(p1.getName() + " is fast asleep!");
						}
						p1.setSleepCounter(p1.getSleepCounter() - 1);
						if (p1.getAbility() == Ability.EARLY_BIRD) { p1.setSleepCounter(p1.getSleepCounter() - 1); }
					} else {
						if (showText) {
							System.out.println(p1.getName() + " woke up!");
						}
						p1.setStatus(Status.OKAY);
						p1.useMoveIndex(p1Move, p2, showText);
					}
				}
				else if (p1.getStatus().equals(Status.PARALYSIS) && Math.random() < 0.25) {
					if (showText) {
						System.out.println(p1.getName() + " is paralysed! It can't move!");
					}
				}
				// TODO: moves that thaw on use
				else if (p1.getStatus().equals(Status.FREEZE)) {
					if (Math.random() >= 0.2) {
						if (showText) {
							System.out.println(p1.getName() + " is frozen solid!");
						}
					} else {
						if (showText) {
							System.out.println(p1.getName() + " is no longer frozen!"); // TODO: correct text?
						}
						p1.setStatus(Status.OKAY);
						p1.useMoveIndex(p1Move, p2, showText);
					}
				} else {
					// flinch
					if (p1.isFlinch()) {
						if (showText) {
							System.out.println(p1.getName() + " flinched!");
						}
					} else {
						p1.useMoveIndex(p1Move, p2, showText);
					}
				}
			}
			
			// Shed Skin heal chance
			if (p1.getAbility() == Ability.SHED_SKIN && p1.getStatus() != Status.FAINT && Math.random() < 1/3) {
				p1.setStatus(Status.OKAY);
				if (showText) {
					System.out.println(p1.getName() + " was cured of its status by Shed Skin!"); // TODO: proper text?
				}
			}
			
			if (p2.getAbility() == Ability.SHED_SKIN && p2.getStatus() != Status.FAINT && Math.random() < 1/3) {
				p2.setStatus(Status.OKAY);
				if (showText) {
					System.out.println(p2.getName() + " was cured of its status by Shed Skin!"); // TODO: proper text?
				}
			}
			
			
			// burn damage
			if (p1.getStatus().equals(Status.BURN)) {
				int burnDamage = (int) Math.max(p1.getTotalHP()/8, 1);
				if (p1.getAbility() == Ability.HEATPROOF) {
					burnDamage = (int) burnDamage/2;
				}
				p1.damage(burnDamage, showText);
				if (showText) {
					System.out.println(p1.getName() + " is hurt by its burn!");
				}
			}
			
			if (p2.getStatus().equals(Status.BURN)) {
				int burnDamage = (int) Math.max(p2.getTotalHP()/8, 1);
				if (p2.getAbility() == Ability.HEATPROOF) {
					burnDamage = (int) burnDamage/2;
				}
				p2.damage(burnDamage, showText);
				if (showText) {
					System.out.println(p2.getName() + " is hurt by its burn!");
				}
			}
			
			// TODO: abilities that affect poison damage
			// poison damage
			if (p1.getStatus().equals(Status.POISON)) {
				int poisonDamage = (int) Math.max(p1.getTotalHP()/8, 1);
				if (p1.getAbility() == Ability.POISON_HEAL) {
					p1.heal(poisonDamage, false);
					if (showText) {
						System.out.println(p1.getName() + "'s Poison Heal restored its health!");
					}
				} else {
					p1.damage(poisonDamage, showText);
					if (showText) {
						System.out.println(p1.getName() + " is hurt by poison!");
					}
				}
			}

			if (p2.getStatus().equals(Status.POISON)) {
				int poisonDamage = (int) Math.max(p2.getTotalHP()/8, 1);
				if (p2.getAbility() == Ability.POISON_HEAL) {
					p2.heal(poisonDamage, false);
					if (showText) {
						System.out.println(p2.getName() + "'s Poison Heal restored its health!");
					}
				} else {
					p2.damage(poisonDamage, showText);
					if (showText) {
						System.out.println(p2.getName() + " is hurt by poison!");
					}
				}
			}
			
			// bad poison damage
			if (p1.getStatus().equals(Status.BAD_POISON)) {
				int poisonDamage = Math.max((int) (p1.getTotalHP()/16), 1) * Math.min(p1.getBadPsnCounter(), 15);
				if (p1.getAbility() == Ability.POISON_HEAL) {
					p1.heal((int) Math.max(p1.getTotalHP()/8, 1), false);
					if (showText) {
						System.out.println(p1.getName() + "'s Poison Heal restored its health!");
					}
				} else {
					p1.damage(poisonDamage, showText);
					if (showText) {
						System.out.println(p1.getName() + " is hurt by poison!");
					}
				}
				p1.setBadPsnCounter(p1.getBadPsnCounter() + 1);
			}
			
			if (p2.getStatus().equals(Status.BAD_POISON)) {
				int poisonDamage = Math.max((int) (p2.getTotalHP()/16), 1) * Math.min(p2.getBadPsnCounter(), 15);
				if (p2.getAbility() == Ability.POISON_HEAL) {
					p2.heal((int) Math.max(p2.getTotalHP()/8, 1), false);
					if (showText) {
						System.out.println(p2.getName() + "'s Poison Heal restored its health!");
					}
				} else {
					p2.damage(poisonDamage, showText);
					if (showText) {
						System.out.println(p2.getName() + " is hurt by poison!");
					}
				}
				p2.setBadPsnCounter(p2.getBadPsnCounter() + 1);
			}
			
			// bad dreams damage
			// TODO: check order/timing of damage (eg. what if two Darkrai are asleep with < 1/8th HP?)
			if (p1.getStatus() == Status.SLEEP && p2.getAbility() == Ability.BAD_DREAMS) {
				int damage = (int) Math.max(p1.getTotalHP()/8, 1);
				if (showText) {
					System.out.println(p1.getName() + " is hurt by " + p2.getName() + "'s bad dreams!"); // TODO: check text
				}
				p1.damage(damage, showText);
			}
			
			if (p2.getStatus() == Status.SLEEP && p1.getAbility() == Ability.BAD_DREAMS) {
				int damage = (int) Math.max(p2.getTotalHP()/8, 1);
				if (showText) {
					System.out.println(p2.getName() + " is hurt by " + p1.getName() + "'s bad dreams!"); // TODO: check text
				}
				p2.damage(damage, showText);
			}
			
			// speed boost
			// TODO: text
			if (p1.getAbility() == Ability.SPEED_BOOST) { p1.incSpeedMod(); }
			if (p2.getAbility() == Ability.SPEED_BOOST) { p2.incSpeedMod(); }
			
			p1.setFlinch(false);
			p2.setFlinch(false);
			turnCount++;
		}
		
		if (p2.getStatus().equals(Status.FAINT)) {
			acc = 1;
		}
		
		return acc;
	}
	
	// Runs individual battles until this.count is reached
	// Restores in between rounds
	// Text set to off by default
	public int allBattles() {
		int acc = 0;
		int roundNum = 0;
		
		while (roundNum++ < count) {
			p1.reset();
			p2.reset();
			acc += oneBattle(false);
		}
		
		System.out.println("Wins: " + acc + "/" + count);
		return acc;
	}
	
	// Runs individual battles until this.count is reached
	// Restores in between rounds
	// Text set to off by default
	public int runBattles(int n) {
		int acc = 0;
		int roundNum = 0;

		while (roundNum++ < n) {
			p1.reset();
			p2.reset();
			acc += oneBattle(false);
		}

		System.out.println("Wins (" + p1.code + " vs " + p2.code + "):" + acc + "/" + n);
		return acc;
	}

	// Picks a move out of those available
	// Currently random
	// TODO: heuristics!!!!
	// Return 0 for Struggle
	private int chooseMove(Pkmn user, Pkmn target, int turnCount) {
		
		int i = 0;
		
		// Check if moves are available and have PP
		// Used for Struggle
		// TODO: check for disable, etc to determine if Struggle should be used
		boolean hasM1 = (user.hasMove(1) && user.getPP(1) > 0);
		boolean hasM2 = (user.hasMove(2) && user.getPP(2) > 0);
		boolean hasM3 = (user.hasMove(3) && user.getPP(3) > 0);
		boolean hasM4 = (user.hasMove(4) && user.getPP(4) > 0);
		
		if (!(hasM1 || hasM2 || hasM3 || hasM4)) { return 0; }


		i = chooseStrongestPriorityMove(user, target);
		
		if (i == 0 || user.getMove(i).getExpectedDamage(user, target) < target.getCurrHP()) {
			i = chooseStrongestMove(user, target);
		}
		
		// for first turn (if strongest move not expected to KO opponent)
		// 10% chance anyway
		if (i == 0 || (turnCount == 0 && user.getMove(i).getExpectedDamage(user, target) < target.getCurrHP()) || Math.random() < 0.10) {
			int j = chooseRandomStatusMove(user, target);
			int k = chooseRandomStatMove(user, target);
			
			if (Math.max(j, k) > 0) {
				if (Math.min(j, k) == 0) {
					i = Math.max(j, k);
				} else {
					if (Math.random() < 0.5) {
						i = j;
					} else {
						i = k;
					}
				}
			}
		}
		
		// 15% chance of doing random move anyway
		if (i == 0 || Math.random() < 0.15) { i = chooseRandomMove(user); }
		
		return i;
	}

	private int chooseRandomStatMove(Pkmn user, Pkmn target) {
		int j = 0;
		boolean hasStatMove = false;
		
		for (int i = 1; i < 5; i++) {
			hasStatMove = hasStatMove || (user.hasMove(i) && user.getPP(i) > 0 &&
					user.getMove(i).isStatMove());
		}
		
		if (hasStatMove) {
			do {
				j = chooseRandomMove(user);
			} while (!user.getMove(j).isStatMove());
		}
		
		return j;
	}

	private int chooseRandomStatusMove(Pkmn user, Pkmn target) {
		int j = 0;
		boolean hasStatusMove = false;
		
		for (int i = 1; i < 5; i++) {
			hasStatusMove = hasStatusMove || (user.hasMove(i) && user.getPP(i) > 0 && user.getMove(i).isStatusMove());
		}
		
		if (hasStatusMove) {
			do {
				j = chooseRandomMove(user);
			} while (!user.getMove(j).isStatusMove());
		}
		
		return j;
	}

	/**
	 * Only considers priority moves
	 * @param user
	 * @param target
	 * @return
	 */
	private int chooseStrongestPriorityMove(Pkmn user, Pkmn target) {
		// keep track of best result
		int bestMove = 0;
		double bestDamage = 0;

		for (int i = 1; i < 5; i++) {
			if (user.hasMove(i) && user.getPP(i) > 0 && user.getMove(i).getCategory() != 2 && user.getMove(i).getPriority() > 0) {
				Move move = user.getMove(i);

				double damage = move.getExpectedDamage(user, target);

				if (damage > bestDamage) {
					bestDamage = damage;
					bestMove = i;
				}
			}
		}

		return bestMove;
	}

	private int chooseStrongestMove(Pkmn user, Pkmn target) {
		// keep track of best result
		int bestMove = 0;
		double bestDamage = 0;
		
		for (int i = 1; i < 5; i++) {
			if (user.hasMove(i) && user.getPP(i) > 0 && user.getMove(i).getCategory() != 2) {
				Move move = user.getMove(i);
				
				double damage = move.getExpectedDamage(user, target);
				
				if (damage > bestDamage) {
					bestDamage = damage;
					bestMove = i;
				}
			}
		}
		
		return bestMove;
	}

	private int chooseRandomMove(Pkmn user) {
		int i = 1;
		double rand = 0;
		do {
			rand = Math.random()*4 + 1;
			i = (int) rand;
		} while (!(user.hasMove(i) && user.getPP(i) > 0));
		return i;
		
	}

	private boolean isBattleOver() {
		// TODO Auto-generated method stub
		
		return (p1.getStatus().equals(Status.FAINT) || p2.getStatus().equals(Status.FAINT));
	}
	
	public static int getCounterGenVSim() {
	    return counter;
	}
}

package src.model;

public class ActivePkmn {
	
	Pkmn pkmn;
	
	// TODO: volatile statuses - List<??>?
	
	int sleepCnt;
	int badPsnCnt;
	
	Ability volAbility;
	Type volType;
	
	// stat modifiers -- [-6,6]
	int scA = 0;
	int scD = 0;
	int scSP = 0;
	int scSA = 0;
	int scSD = 0;
	
	int scAcc = 0;
	int scEv = 0;

}

package ie.rufino.entity;

public enum TipoPlayer {

	Player(0), Master(1);
	
	private int value;

	private TipoPlayer(int value) {
		this.value = value;
	}
	
	public String getPlayer(int type){
		if(type==Player.value){
			return "Player";
		}else 
		if(type==Master.value){
			return "Master";
		}
		return null;
	}
}

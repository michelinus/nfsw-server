package br.com.soapboxrace.engine;

public class Achievements extends Router {

	public String achdef() {
       return "<Definitions /><AchievementDefinitionPacket />\n";
	}

	public String loadall() {
	   return "<AchievementsPacket />\n";
    }
}

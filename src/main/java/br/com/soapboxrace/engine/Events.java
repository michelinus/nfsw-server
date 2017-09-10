package br.com.soapboxrace.engine;

import br.com.soapboxrace.bo.EventsBO;
import br.com.soapboxrace.jaxb.EventsPacketType;
import br.com.soapboxrace.jaxb.util.MarshalXML;

public class Events extends Router {

	EventsBO eventsBO = new EventsBO();

	public String availableatlevel() {
		Long userId = getUserId();
		String securityToken = getSecurityToken();
		EventsPacketType availableatlevel = eventsBO.availableatlevel(userId, securityToken);
		return MarshalXML.marshal(availableatlevel);
	}

	public String gettreasurehunteventsession() {
      return "<TreasureHuntEventSession xmlns='http://schemas.datacontract.org/2004/07/Victory.DataLayer.Serialization.Event' xmlns:i='http://www.w3.org/2001/XMLSchema-instance'><CoinsCollected>0</CoinsCollected><IsStreakBroken>true</IsStreakBroken><NumCoins>15</NumCoins><Seed>-990933902</Seed><Streak>0</Streak></TreasureHuntEventSession>";
	}

	public String instancedaccolades() {
		return "";
	}
}

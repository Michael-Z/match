package com.roy.football.match.OFN.out;

import com.roy.football.match.OFN.out.header.Header;
import com.roy.football.match.base.TeamLabel;
import com.roy.football.match.base.TeamLevel;

public class OFNExcelData {

	@Override
	public String toString() {
		return "OFNExcelData [matchDayId=" + matchDayId + ", matchTime="
				+ matchTime + ", leagueName=" + leagueName + ", hostName="
				+ hostName + ", guestName=" + guestName + ", hostLevel="
				+ hostLevel + ", hostLabel=" + hostLabel + ", guestLevel="
				+ guestLevel + ", guestLabel=" + guestLabel + ", originPanKou="
				+ originPanKou + ", predictPanKou=" + predictPanKou
				+ ", tooHot=" + tooHot + ", kill=" + kill + ", promote="
				+ promote + "]";
	}

	public Long getMatchDayId() {
		return matchDayId;
	}
	public void setMatchDayId(Long matchDayId) {
		this.matchDayId = matchDayId;
	}
	public String getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getHostLevel() {
		return hostLevel;
	}
	public void setHostLevel(String hostLevel) {
		this.hostLevel = hostLevel;
	}
	public String getHostLabel() {
		return hostLabel;
	}
	public void setHostLabel(String hostLabel) {
		this.hostLabel = hostLabel;
	}
	public String getGuestLevel() {
		return guestLevel;
	}
	public void setGuestLevel(String guestLevel) {
		this.guestLevel = guestLevel;
	}
	public String getGuestLabel() {
		return guestLabel;
	}
	public void setGuestLabel(String guestLabel) {
		this.guestLabel = guestLabel;
	}
	public String getOriginPanKou() {
		return originPanKou;
	}
	public void setOriginPanKou(String originPanKou) {
		this.originPanKou = originPanKou;
	}
	public String getPredictPanKou() {
		return predictPanKou;
	}
	public void setPredictPanKou(String predictPanKou) {
		this.predictPanKou = predictPanKou;
	}
	public String getKill() {
		return kill;
	}
	public void setKill(String kill) {
		this.kill = kill;
	}
	public String getPromote() {
		return promote;
	}
	public void setPromote(String promote) {
		this.promote = promote;
	}
	public String getTooHot() {
		return tooHot;
	}
	public void setTooHot(String tooHot) {
		this.tooHot = tooHot;
	}


	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


	@Header(order=10, title="Match Id")
	private Long matchDayId;
	@Header(order=20, title="Match Time")
	private String matchTime;
	@Header(order=30, title="League Name")
	private String leagueName;
	@Header(order=40, title="Host Name")
	private String hostName;
	@Header(order=50, title="Guest Name")
	private String guestName;
	@Header(order=60, title="Host Level [winRt, winGoal]")
	private String hostLevel;
	@Header(order=70, title="Host Label")
	private String hostLabel;
	@Header(order=80, title="Guest Level [winRt, winGoal]")
	private String guestLevel;
	@Header(order=90, title="Guest Label")
	private String guestLabel;
	@Header(order=100, title="Origin PK [Main, Latest]")
	private String originPanKou;
	@Header(order=110, title="Predict PK [Latest]")
	private String predictPanKou;
	@Header(order=120, title="Hot")
	private String tooHot;
	@Header(order=130, title="Kill[pk | pl]")
	private String kill;
	@Header(order=140, title="Promote")
	private String promote;
	@Header(order=150, title="Result")
	private String result;
}
package com.roy.football.match.OFN.response;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.roy.football.match.base.League;
import com.roy.football.match.base.MatchData;

public class OFNMatchData implements MatchData{

	@Override
	public String toString() {
		return "OFNMatchData [matchDayId=" + matchDayId + ", matchId="
				+ matchId + ", matchTime=" + matchTime + ", league="
				+ league + ", hostId="
				+ hostId + ", hostName=" + hostName + ", guestId=" + guestId
				+ ", guestName=" + guestName
				+ ", baseData=" + baseData + ", jiaoShou=" + jiaoShou
				+ ", hostMatches=" + hostMatches + ", guestMatches="
				+ guestMatches + ", euroPls=" + euroPls + ", aoMen=" + aoMen
				+ "]";
	}

	public Long getMatchId() {
		return matchId;
	}
	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}
	public Date getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(Date matchTime) {
		this.matchTime = matchTime;
	}
	public Long getHostId() {
		return hostId;
	}
	public void setHostId(Long hostId) {
		this.hostId = hostId;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public Long getGuestId() {
		return guestId;
	}
	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public ClubDatas getBaseData() {
		return baseData;
	}

	public void setBaseData(ClubDatas baseData) {
		this.baseData = baseData;
	}

	public Map<Company, List<EuroPl>> getEuroPls() {
		return euroPls;
	}

	public void setEuroPls(Map<Company, List<EuroPl>> euroPls) {
		this.euroPls = euroPls;
	}

	public List<AsiaPl> getAoMen() {
		return aoMen;
	}

	public void setAoMen(List<AsiaPl> aoMen) {
		this.aoMen = aoMen;
	}


	public List<FinishedMatch> getJiaoShou() {
		return jiaoShou;
	}

	public void setJiaoShou(List<FinishedMatch> jiaoShou) {
		this.jiaoShou = jiaoShou;
	}


	public List<FinishedMatch> getHostMatches() {
		return hostMatches;
	}

	public void setHostMatches(List<FinishedMatch> hostMatches) {
		this.hostMatches = hostMatches;
	}



	public List<FinishedMatch> getGuestMatches() {
		return guestMatches;
	}

	public void setGuestMatches(List<FinishedMatch> guestMatches) {
		this.guestMatches = guestMatches;
	}


	public Long getMatchDayId() {
		return matchDayId;
	}

	public void setMatchDayId(Long matchDayId) {
		this.matchDayId = matchDayId;
	}

	public List<AsiaPl> getDaxiao() {
		return daxiao;
	}

	public void setDaxiao(List<AsiaPl> daxiao) {
		this.daxiao = daxiao;
	}

	public EuroPl getEuroAvg() {
		return euroAvg;
	}

	public void setEuroAvg(EuroPl euroAvg) {
		this.euroAvg = euroAvg;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public Long getOkoooMatchId() {
		return okoooMatchId;
	}

	public void setOkoooMatchId(Long okoooMatchId) {
		this.okoooMatchId = okoooMatchId;
	}

	public Integer getHostScore() {
		return hostScore;
	}

	public void setHostScore(Integer hostScore) {
		this.hostScore = hostScore;
	}

	public Integer getGuestScore() {
		return guestScore;
	}

	public void setGuestScore(Integer guestScore) {
		this.guestScore = guestScore;
	}

	public List<AsiaPl> getYsb() {
		return ysb;
	}

	public void setYsb(List<AsiaPl> ysb) {
		this.ysb = ysb;
	}

	private Long okoooMatchId;
	private Long matchDayId;
	private Long matchId;
	private Date matchTime;
	private League league;
	private Long hostId;
	private String hostName;
	private Long guestId;
	private String guestName;
	private EuroPl euroAvg;
	private ClubDatas baseData;
	private List<FinishedMatch> jiaoShou;
	private List<FinishedMatch> hostMatches;
	private List<FinishedMatch> guestMatches;
	private Map<Company, List<EuroPl>> euroPls;
	private List<AsiaPl> aoMen;
	private List<AsiaPl> daxiao;
	private List<AsiaPl> ysb;
	private Integer hostScore;
	private Integer guestScore;
}

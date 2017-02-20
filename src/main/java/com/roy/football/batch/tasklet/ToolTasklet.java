package com.roy.football.batch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import com.roy.football.match.base.League;
import com.roy.football.match.jpa.EntityConverter;
import com.roy.football.match.jpa.entities.calculation.ELeague;
import com.roy.football.match.jpa.repositories.ELeagueRepository;
import com.roy.football.match.service.HistoryMatchCalculationService;
import com.roy.football.match.service.MatchEuroRecalculateService;

public class ToolTasklet implements Tasklet{
	
	@Autowired
	private ELeagueRepository eLeagueRepository;
	
	@Autowired 
	private MatchEuroRecalculateService matchEuroRecalculateService;


	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		recalculateMissedEuro();
		
		return null;
	}
	
	private void saveLeagues () {
		for (League le : League.values()) {
			ELeague eleague = EntityConverter.toEleague(le);
			
			eLeagueRepository.save(eleague);
		}
	}

	private void recalculateMissedEuro () {
		matchEuroRecalculateService.recalculate();
	}
}

package pt.ulisboa.tecnico.cmu.command;

import pt.ulisboa.tecnico.cmu.response.Response;

public interface CommandHandler {
	public Response handle(HelloCommand hc);
	public Response handle(TicketCommand tc);
	public Response handle(GetQuizCommand gqc);
	public Response handle(SignUpCommand suc);
  	public Response handle(GetMonumentsCommand gmc);
  	public Response handle(GetRankingCommand grc);
}

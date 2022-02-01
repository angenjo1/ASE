package makeYourDay.interfaces;

import java.time.LocalDate;

import makeYourDay.applicationLogic.Kanban;

public interface I_Day {
	public LocalDate getDate();
	public Kanban getKanban();
	
}

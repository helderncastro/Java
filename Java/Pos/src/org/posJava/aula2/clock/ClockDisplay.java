package org.posJava.aula2.clock;

public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    
        
    public ClockDisplay()
    {
        hours = new NumberDisplay(24,0);
        minutes = new NumberDisplay(60,0);
        updateDisplay();
    }

    
    public ClockDisplay(int hora, int minuto)
    {
        hours = new NumberDisplay(24,0);
        minutes = new NumberDisplay(60,0);
        setTime(hora, minuto);
    }
    
    public ClockDisplay(NumberDisplay horas, NumberDisplay minutos) {
    	
		this.hours = horas;
		this.minutes = minutos;
	}
    
    public void tickTime()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }
    
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }

    
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    
    public String getTime()
    {
        return displayString;
    }


	public NumberDisplay getHours() {
		return hours;
	}


	public NumberDisplay getMinutes() {
		return minutes;
	}


	public String getDisplayString() {
		return displayString;
	}


	public void setHours(NumberDisplay hours) {
		this.hours = hours;
	}


	public void setMinutes(NumberDisplay minutes) {
		this.minutes = minutes;
	}


	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}

	public String toString() {
		return hours + ":" + minutes;
	}
	
    
    
    
}

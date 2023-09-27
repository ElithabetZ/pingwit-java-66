package javaCore.lesson_29.home_work.task_2;

import java.util.Objects;

public class Forecast {
    private String name;
    private String curDate;
    private String curTem;
    private String curFeels;
    private String curCloud;
    private String nightTemp;
    private String dayTemp;
    private String chanceOfPrecipition;
    private String uvIndex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurDate() {
        return curDate;
    }

    public void setCurDate(String curDate) {
        this.curDate = curDate;
    }

    public String getCurTem() {
        return curTem;
    }

    public void setCurTem(String curTem) {
        this.curTem = curTem;
    }

    public String getCurFeels() {
        return curFeels;
    }

    public void setCurFeels(String curFeels) {
        this.curFeels = curFeels;
    }

    public String getCurCloud() {
        return curCloud;
    }

    public void setCurCloud(String curCloud) {
        this.curCloud = curCloud;
    }

    public String getNightTemp() {
        return nightTemp;
    }

    public void setNightTemp(String nightTemp) {
        this.nightTemp = nightTemp;
    }

    public String getDayTemp() {
        return dayTemp;
    }

    public void setDayTemp(String dayTemp) {
        this.dayTemp = dayTemp;
    }

    public String getChanceOfPrecipition() {
        return chanceOfPrecipition;
    }

    public void setChanceOfPrecipition(String chanceOfPrecipition) {
        this.chanceOfPrecipition = chanceOfPrecipition;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forecast forecast)) return false;
        return Objects.equals(name, forecast.name) && Objects.equals(curDate, forecast.curDate) && Objects.equals(curTem, forecast.curTem) && Objects.equals(curFeels, forecast.curFeels) && Objects.equals(curCloud, forecast.curCloud) && Objects.equals(nightTemp, forecast.nightTemp) && Objects.equals(dayTemp, forecast.dayTemp) && Objects.equals(chanceOfPrecipition, forecast.chanceOfPrecipition) && Objects.equals(uvIndex, forecast.uvIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, curDate, curTem, curFeels, curCloud, nightTemp, dayTemp, chanceOfPrecipition, uvIndex);
    }

    @Override
    public String toString() {
        return name + '\n' +
                curDate + '\n' +
                "-----------------------------------------" + '\n' +
                "Current temperature " + curTem + "C" + '\n' +
                "Feels like " + curFeels + '\n' +
                curCloud + '\n' +
                "-----------------------------------------" + '\n' +
                "At " + nightTemp + '\n' +
                "At " + dayTemp + '\n' +
                "-----------------------------------------" + '\n' +
                chanceOfPrecipition + '\n' +
                uvIndex + '\n' +
                "///////////////////////////////" + '\n';
    }
}

package MidtermReview;

public class WeeklyWeatherData {
	static int NUMDAYS = 7;
	double[] rainFall = new double[NUMDAYS];
	double[] avgPressure = new double[NUMDAYS];
	double avgRain;
	double maxRain;

	void setData(double[] rain, double[] pressure) {
		rainFall = rain;
		avgPressure = pressure;
	}

	void calculateStats() {
		maxRain = 0.0;
		double rainSum = 0.0;
		for (int i = 0; i < rainFall.length; i++) {
			if (rainFall[i] >= maxRain)
				maxRain = rainFall[i];
			rainSum += rainFall[i];
		}
		this.avgRain = rainSum / rainFall.length;
	}

	double getAvgRain() {
		return avgRain;
	}

	double getMaxRain() {
		return maxRain;
	}
}

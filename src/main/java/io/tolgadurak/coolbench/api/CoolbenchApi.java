package io.tolgadurak.coolbench.api;

import io.tolgadurak.coolbench.algorithm.BenchmarkAlgorithm;
import io.tolgadurak.coolbench.counter.CoolbenchPerformanceCounter;
import io.tolgadurak.coolbench.wrapper.CoolbenchResult;

public class CoolbenchApi {

	public CoolbenchResult doBenchmark(Integer nTimes, Integer nThreads, String algorithm) throws InterruptedException {
		CoolbenchPerformanceCounter counter = new CoolbenchPerformanceCounter();
		BenchmarkAlgorithm benchmarkAlgorithm = BenchmarkAlgorithm.getInstance(algorithm);
		return counter.benchmark(nTimes, nThreads, benchmarkAlgorithm);
	}
}

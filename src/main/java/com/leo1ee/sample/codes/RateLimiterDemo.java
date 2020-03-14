package com.leo1ee.sample.codes;

import com.google.common.util.concurrent.RateLimiter;

/**
 * @author leolee
 * @date 2020/3/13.
 */
public class RateLimiterDemo {

  public static void main(String[] args) {
    double tps = 10;
    RateLimiter rateLimiter = RateLimiter.create(tps);
    for (int i = 0; i < 100; i++) {
      System.out.println("line " + i);
      rateLimiter.acquire(1);
    }
    System.out.println("end");
  }
}

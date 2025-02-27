public class FakedExchange implements Exchange {
  private final static float EXCHANGE_RATE = 0.95f;

  public FakedExchange() {
  }

  @Override
  public float rate(String origin, String target) {
      return EXCHANGE_RATE;
  }
}

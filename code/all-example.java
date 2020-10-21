new AbstractAgent("all-example") {
  @Override 
  public void setup() {
    Behaviour.allOf(
        Behaviour.of(() -> print(1))
            .andThen(() -> print(2)),

        Behaviour.of(() -> print("a"))
            .andThen(() -> print("b"))
            .andThen(() -> print("c"))
    ).andThen(() -> stop())
    .addTo(this);
  }
}

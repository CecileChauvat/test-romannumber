package hello;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class romanTest {

	RomanNumberConverter romannumberconverter;
	
@Before
	public void setup() {
		romannumberconverter = new RomanNumberConverter();
	}

@Test
  	public void check() {
    		assertThat(hello.hello("Julien"))
      		.isNotEmpty()
      		.contains("Hello")
      		.endsWith("!")
      		.isEqualTo("Hello Julien!");
  }

@Test
	public void check_null() {
		assertThatThrownBy(() -> romannumberconverter.romannumberconverter(null))
      		.isInstanceOf(IllegalArgumentException.class)
      		.hasMessageContaining("cannot be null");
  	}

}

package hu.fape.example.rqlparser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.parboiled.Parboiled;

public class RqlParserTest {

    private RqlParser parser;

    @BeforeEach
    public void before() {
        parser = Parboiled.createParser(RqlParser.class);
    }

    @Test
    void testNonNull() {
        Assertions.assertNotNull(parser);
    }
}

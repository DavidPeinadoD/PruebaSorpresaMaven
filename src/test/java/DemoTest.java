import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DemoTest {

    @InjectMocks
    private Demo underTest;

    @org.junit.jupiter.api.Test
    void main() {
    }

    @Nested
    class WhenMaining {
        @Mock
        private String[] args;

        @BeforeEach
        void setup() {
        }
    }
}
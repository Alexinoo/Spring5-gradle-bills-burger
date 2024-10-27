package academy.learnprogramming.bb_bms;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    public static final String SAMPLE_MESSAGE = "Hello from the core module";
    @Override
    public String getMessage() {
        return SAMPLE_MESSAGE;
    }
}

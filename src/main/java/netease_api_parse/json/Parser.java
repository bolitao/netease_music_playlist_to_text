package netease_api_parse.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parser<T> {
    ObjectMapper objectMapper = new ObjectMapper();
    final Class<T> tClass;

    public Parser(Class<T> tClass) {
        this.tClass = tClass;
    }

    public T ret(String content) throws JsonProcessingException {
        return objectMapper.readValue(content, tClass);
    }
}

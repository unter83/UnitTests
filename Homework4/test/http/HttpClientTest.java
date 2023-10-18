package http;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class HttpClientTest {

    @Test
    void httpClientTesting() {
        WebService webServiceMock = mock(WebService.class);
        HttpClient httpClient = new HttpClient(webServiceMock);
        when(webServiceMock.localhost()).thenReturn("Hello! This is localhost");
        assertThat(httpClient.get("127.0.0.1")).isEqualTo("Hello! This is localhost");
        verify(webServiceMock, times(1)).localhost();
    }
}

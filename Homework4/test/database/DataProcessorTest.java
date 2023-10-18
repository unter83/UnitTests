package database;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class DataProcessorTest {

    @Test
    void dataProcessorTesting() {
        Database dataBaseMock = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(dataBaseMock);

        assertThat(dataProcessor.processData("Hello world!")).isInstanceOf(List.class);
        verify(dataBaseMock, times(1)).query("Hello world!");
        List<String> listMock = mock(List.class);

        when(dataBaseMock.query("Hello world!")).thenReturn(listMock);
        when(listMock.get(0)).thenReturn("Data1");
        when(listMock.size()).thenReturn(3);
        assertThat(dataProcessor.processData("Hello world!").get(0)).isEqualTo("Data1");
        assertThat(dataProcessor.processData("Hello world!").size()).isEqualTo(3);
    }

}
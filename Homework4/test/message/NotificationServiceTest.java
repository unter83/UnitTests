package message;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void notificationServiceTesting() {

        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);
        notificationService.sendNotification("Hello world!", "Testing");
        verify(messageServiceMock, times(1)).sendMessage("Hello world!", "Testing");
    }

}
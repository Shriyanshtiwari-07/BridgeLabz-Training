package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.JUnit.annotation.DatabaseConnection;

public class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    public void tearDown() {
        db.disconnect();
    }

    @Test
    public void testConnectionEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    public void testConnectionClosed() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}

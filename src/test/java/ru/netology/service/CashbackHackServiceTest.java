package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldProposeOne() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldProposeFiveHundred() {
        assertEquals(500, service.remain(1500));
    }

    @Test
    public void shouldProposeOnethousand() {
        assertEquals(1000, service.remain(1000));
    }
}
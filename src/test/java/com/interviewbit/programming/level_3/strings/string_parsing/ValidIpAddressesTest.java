package com.interviewbit.programming.level_3.strings.string_parsing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidIpAddressesTest {

    ValidIpAddresses validIpAddresses;
    @BeforeEach
    void setUp() {
        validIpAddresses = new ValidIpAddresses();
    }

    @Test
    void restoreIpAddresses() {
        List<String> expectedList1 = new ArrayList<>(Arrays.asList("255.255.11.135", "255.255.111.35"));
        assertAll(
                () -> assertIterableEquals(expectedList1, validIpAddresses.restoreIpAddresses("25525511135"))
        );
    }
}
package com.dhkpo.effectivejava.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        Optional<MemberShip> memberShip = channel.defaultMemberShip();
        memberShip.ifPresent(MemberShip::hello);
    }
}

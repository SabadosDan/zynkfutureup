package ro.zynk.futureup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.zynk.futureup.controllers.responses.CoinResponse;
import ro.zynk.futureup.domain.dtos.Coin;
import ro.zynk.futureup.domain.repositories.CoinRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoinService {
    private CoinRepository coinRepository;

    @Autowired
    public CoinService(CoinRepository coinRepository) {
        this.coinRepository = coinRepository;
    }

    public List<CoinResponse> getAllCoins() {
        var coinList = this.coinRepository.findAll();
        var coinResponseList = new ArrayList<CoinResponse>();
        for (Coin coin : coinList) {
            coinResponseList.add(new CoinResponse(coin));
        }

        return coinResponseList;
    }

    public CoinResponse saveNewCoin(CoinResponse coinResponse) {
        Coin coinEntity = new Coin(coinResponse);
        coinEntity = coinRepository.save(coinEntity);
        return new CoinResponse(coinEntity);
    }
}

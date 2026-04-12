package dtos;

import java.util.List;

import com.akhil.splitwise.services.settleup.Transaction;

@Getter
@Setter
public class SettleUpUserResponseDto {
	private List<Transaction> transactions;
}

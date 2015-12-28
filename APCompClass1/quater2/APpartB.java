package quater2;

public class APpartB {

	int[] samples = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
	
	public static void main(String[] args) {
		new APpartB().trimSilenceFromBeginning();
	}

	public void trimSilenceFromBeginning(){
		int zeroCount = 0;
		
		for(int i : samples){
			if(i == 0){
				zeroCount++;
			}
			else{
				break;
			}
		}

		int[] trimSamples = new int[samples.length - zeroCount];
		
		for(int i = 0; i < samples.length - zeroCount; i++){
			trimSamples[i] = samples[i + zeroCount];
		}
		
		samples = trimSamples;
	}
}

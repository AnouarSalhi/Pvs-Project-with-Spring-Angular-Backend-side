package com.pvs;

import com.pvs.entities.Pv;
import com.pvs.entities.SourcePvs;
import com.pvs.entities.TypePoliceJudic;
import com.pvs.entities.TypeSourcePvs;
import com.pvs.repositories.PvRepository;
import com.pvs.repositories.SourcePvsRepository;
import com.pvs.repositories.TypePoliceJudicRepository;
import com.pvs.repositories.TypeSourcePvsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PvsApplication implements CommandLineRunner {
    @Autowired
    private SourcePvsRepository sourcePvsRepository;
    @Autowired
    private TypePoliceJudicRepository typePoliceJudicRepository;
    @Autowired
    private TypeSourcePvsRepository typeSourcePvsRepository;
    @Autowired
    private PvRepository pvRepository;
    public static void main(String[] args) {
        SpringApplication.run(PvsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create Source Pvs Data
        SourcePvs sp = sourcePvsRepository.save(new SourcePvs(1, "محلي", null));
        sourcePvsRepository.save(new SourcePvs(2,"انابة",null));
        sourcePvsRepository.save(new SourcePvs(3,"اختصاص",null));

        //Create Type polic Judic Data
        TypePoliceJudic tpj = typePoliceJudicRepository.save(new TypePoliceJudic(1, "الوكلاء العامون للملك", null, null));
        typePoliceJudicRepository.save(new TypePoliceJudic(2,"ضباط الشرطة القضائية.",null,null));
        typePoliceJudicRepository.save(new TypePoliceJudic(3,"أعوان الشرطة القضائية.",null,null));
        typePoliceJudicRepository.save(new TypePoliceJudic(4,"الوكيل العام للملك",null,null));
        typePoliceJudicRepository.save(new TypePoliceJudic(5,"قضاة التحقيق بمحاكم الإستئناف",null,null));

       // Create typeSourcePvsRepository data:
        TypeSourcePvs tsp = typeSourcePvsRepository.save(new TypeSourcePvs(1, "data1", null, null));
        typeSourcePvsRepository.save(new TypeSourcePvs(2,"data2",null,null));
        typeSourcePvsRepository.save(new TypeSourcePvs(3,"data3",null,null));

        pvRepository.save(new Pv(1,tsp,sp,tpj,204,new Date(),null,true,"pv subject1",null,null));
        pvRepository.save(new Pv(2,tsp,sp,tpj,678,new Date(),null,false,"pv subject2",null,null));
        pvRepository.save(new Pv(3,tsp,sp,tpj,234,new Date(),null,true,"pv subject3",null,null));

    }
}

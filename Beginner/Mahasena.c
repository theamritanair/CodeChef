    #include<stdio.h>
    main()
    {
            int n;
            scanf("%d",&n);
            int p[n],i,l=0,unl=0;
            for(int j=0;j<n;j++)
            {
                scanf("%d",&p[j]);
            }
            for(i=0;i<n;i++)
            {
                if(p[i]%2==0)
                l++;
                else
                unl++;
            }
            
                if(l>unl)
                printf("READY FOR BATTLE");
                else
                printf("NOT READY");
    }    